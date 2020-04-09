package jo.edu.htu.statictics;

import java.time.Year;
import java.util.*;

public class StudentsCollector implements StatisticsCollector<Student> {

    public Iterable<Statistic> collect(Iterable<Student> cases) {
        ArrayList <Statistic> statistics=new ArrayList<>();


        statistics.add(new Statistic() {


            @Override
            public String name() {
                return "CIS major";
            }

            @Override
            public Integer matchedCases() {
                int counter = 0;
                for (Student cases1 : cases) {


                        if (cases1.getMajor().equals("CIS"))
                        counter++;

                }
                return counter;
            }
            @Override
            public int compareTo( Statistic statistic ) {
                return 0;
            }

        });

        statistics.add(new Statistic() {

            @Override
            public int compareTo( Statistic statistic ) {
                return 0;
            }

            @Override
            public String name() {
                return "Computer Science major";
            }

            @Override
            public Integer matchedCases() {
                int counter = 0;
                for (Student cases1 : cases) {

                    if (cases1.getMajor().equals("Computer Science"))
                        counter++;
                    }
                    return counter;
                }

        });



        statistics.add(new Statistic() {

            @Override
            public int compareTo( Statistic statistic ) {
                return 0;
            }

            @Override
            public String name() {
                return "graduation year <= 2016";
            }

            @Override
            public Integer matchedCases() {
                int counter=0;
                for (Student cases1:cases) {

                        if (cases1.getGraduationYear().equals(Year.of(2016))||cases1.getGraduationYear().isBefore(Year.of(2016)))
                        counter++;
                }
                return counter;
            }

        });

        statistics.add(new Statistic() {

            @Override
            public int compareTo( Statistic statistic ) {
                return 0;
            }

            @Override
            public String name() {
                return "graduation year > 2016";
            }

            @Override
            public Integer matchedCases() {
                int counter=0;
                for (Student cases1:cases) {

                        if (cases1.getGraduationYear().isAfter(Year.of(2016)))

                        counter++;
                }
                return counter;
            }

        });

        statistics.add(new Statistic() {

            @Override
            public int compareTo( Statistic statistic ) {
                return 0;
            }

            @Override
            public String name() {
                return "Males";
            }

            @Override
            public Integer matchedCases() {
                int counter=0;
                for (Student cases1:cases) {

                        if (cases1.getGender().equals(Gender.MALE))
                        counter++;
                }
                return counter;
            }

        });


        statistics.add(new Statistic() {

            @Override
            public int compareTo( Statistic statistic ) {
                return 0;
            }

            @Override
            public String name() {
                return "Females";
            }

            @Override
            public Integer matchedCases() {
                int counter=0;
                for (Student cases1 : cases) {
                    if (cases1.getGender().equals(Gender.FEMALE))

                        counter++;
                }
                return counter;
            }

        });

        return statistics;}}
