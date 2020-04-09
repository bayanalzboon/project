package jo.edu.htu.statictics;

import jo.edu.htu.statictics.Statistic;
import jo.edu.htu.statictics.StatisticsCollector;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringsCollector implements StatisticsCollector<String> {

    @Override
    public Iterable<Statistic> collect( Iterable<String> cases) {
        ArrayList <Statistic> statistics=new ArrayList<>();


        statistics.add(new Statistic() {
            @Override
            public String name() {
                return "upper case letters";
            }

            @Override
            public Integer matchedCases() {
                int counter=0;
                for (String cases1:cases) {

                    for (int i = 0; i <cases1.length() ; i++) {
                        if(cases1.charAt(i) >= 'A' && cases1.charAt(i)<='Z' )
                            counter++;
                    }
                }
                return counter;
            }

            @Override
            public int compareTo(Statistic o) {
                return 0;
            }
        });

        statistics.add(new Statistic() {
            @Override
            public String name() {
                return "lower case letters";
            }

            @Override
            public Integer matchedCases() {
                int counter=0;
                for (String cases1:cases) {

                    for (int i = 0; i <cases1.length() ; i++) {
                        if(cases1.charAt(i) >= 'a' && cases1.charAt(i)<='z' )
                            counter++;

                    }
                }
                return counter;
            }

            @Override
            public int compareTo(Statistic o) {
                return 0;
            }
        });

        statistics.add(new Statistic() {
            @Override
            public String name() {
                return "spaces count";
            }

            @Override
            public Integer matchedCases() {
                int counter=0;
                for (String cases1:cases) {

                    for (int i = 0; i <cases1.length() ; i++) {
                        char ch=cases1.charAt(i);
                        if (ch==' ')
                        counter++;
                    }
                }
                return counter;
            }

            @Override
            public int compareTo(Statistic o) {
                return 0;
            }
        });


        statistics.add(new Statistic() {
            @Override
            public String name() {
                return "non-word characters";
            }

            @Override
            public Integer matchedCases() {
                int counter=0;
                for (String cases1:cases) {

                        String regex = "\\W";

                        Pattern pattern = Pattern.compile(regex);

                        Matcher matcher = pattern.matcher(cases1);

                        if(matcher.find()) {
                            counter++;
                        }

                }
                return counter;
            }

            @Override
            public int compareTo(Statistic o) {
                return 0;
            }
        });


        return statistics;
    }

}