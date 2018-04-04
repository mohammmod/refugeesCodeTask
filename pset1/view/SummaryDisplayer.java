package pset1.view;

import pset1.modal.Summary;

public class SummaryDisplayer {
    public void display(Summary summary) {

            System.out.println("Top rated movies:\n");
            summary.getTopRatedMovie()
                    .forEach(ratedMovie -> System.out.println(ratedMovie));

            System.out.println(" ------ ");
            System.out.println("most hired actros:\n");
            summary.getActorName()
                    .forEach(actor -> System.out.println(actor));
            System.out.println("------- ");
            System.out.println("Top movie generous:\n");
            summary.getMovieGenres()
                    .forEach(movieGenrous -> System.out.println(movieGenrous));
            System.out.println("------- ");
            System.out.println("Actors male-female ratio:\n");
        System.out.println(summary.getRatio());


    }


    public void display() {
        System.out.println("The info that you tring to reach right now is reachable");
    }
}
