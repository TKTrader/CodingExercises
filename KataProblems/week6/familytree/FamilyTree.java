package KataProblems.week6.familytree;

public class FamilyTree {

    public static String chart(final Person person) {
        public static String solution;
        // NIGHTMARE OF BAD LOGICAL OUTPUT; not even close to output, taking break for better process

        public static String chart(final Person person) {
            int level = 0;
            int num = 1;
            getParent(person, num, level);
            return solution;
        }

        public static String getParent(Person person, int num, int level){
            String selfString = "";
            if (level<5){
                List<Person> parents = person.parents();
                int parentNum;
                for (Person parent : parents) {
                    if (parent.sex().equals("M")){
                        parentNum = num*2;
                        System.out.println(parent.sex());
                    } else {
                        parentNum = num*2+1;
                        System.out.println(parent.sex());
                    }
                    level++;
                    if (person!=null){
                        getParent(parent, parentNum, level);
                    } else {
                        getNull(level);
                    }
                    solution += printSelf(person, num, level);
                }
                solution += printSelf(person, num, level);
                System.out.println(selfString.toString());

            }
            return selfString;
        }

        public static String printSelf(Person person, int num, int level){
            String numString = (num<10) ? "0"+Integer.toString(num) : "" + Integer.toString(num);//Integer.toString(num);
            String space = "";
            String indentation = "";
            int spaces = 7;
            while (level>0){
                indentation += "       ";
                level--;
            }
            while (spaces>0){
                space = indentation + "          |\n" + space;
                spaces--;
//       System.out.println(space);
            }
            String personString;
            if (num%2==0){
                personString = indentation + "|" + numString + " " + person.name();// + space;
                System.out.println("even" + num);
            } else {
                personString = indentation + "|" + numString + " " +person.name();
                System.out.println("odd" + num);
            }
            return personString;
        }

        public static String getNull(int level){
            String indentation = "";
            while (level>0){
                indentation += "       |";
                level--;
            }
            indentation += "_______\n";
            return indentation;
        }
    }
}
