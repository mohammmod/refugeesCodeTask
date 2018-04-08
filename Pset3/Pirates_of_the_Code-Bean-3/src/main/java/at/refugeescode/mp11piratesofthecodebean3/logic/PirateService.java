package at.refugeescode.mp11piratesofthecodebean3.logic;

import at.refugeescode.mp11piratesofthecodebean3.persistence.PieceOfEight;
import at.refugeescode.mp11piratesofthecodebean3.persistence.PieceOfEightRepository;
import at.refugeescode.mp11piratesofthecodebean3.persistence.Pirate;
import at.refugeescode.mp11piratesofthecodebean3.persistence.PirateRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PirateService {

    private PirateRepository pirateRepository;

    private PieceOfEightRepository pieceOfEightRepository;

    private CsvParser csvParser;

    public PirateService(PirateRepository pirateRepository, PieceOfEightRepository pieceOfEightRepository, CsvParser csvParser) {
        this.pirateRepository = pirateRepository;
        this.pieceOfEightRepository = pieceOfEightRepository;
        this.csvParser = csvParser;
    }

    public void populatePirates() {
        deleteAll();

        List<Pirate> pirates = csvParser.asList(new PirateModule("classpath:pirates.csv"));

        pirates.stream()
                .map(pirate -> pirate.getPieceOfEight())
                .forEach(pieceOfEight -> pieceOfEightRepository.save(pieceOfEight));

        pirates.stream()
                .forEach(pirate -> pirateRepository.save(pirate));
    }

    public List<Pirate> findAll() {
        return pirateRepository.findAll(); // return all the pirates from the database
    }

    public void deleteAll() {

        // delete all pirates

        // delete all pieces of eight
        pieceOfEightRepository.deleteAll();

        pirateRepository.deleteAll();

    }
}
