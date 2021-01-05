public class sumTotal {

    /*
        Create String 2D array

        {{"$12" , "$22" , "5"},{"€9" , "€40" , "$1" , "$2"}, {"€12"}}

        if the String has $ multiply by 3.2

        if the String has € multiply by 4.2

        return the double

     */

    public static void main(String[] args) {

//        Code Start Here
        String[][] DE = {{"$12" , "$22" , "5"},{"€9" , "€40" , "$1" , "$2"}, {"€12"}};
        double [][] money = new double[DE.length][];

        int sum=0;
        for (int i = 0; i < DE.length; i++) {
            for (int j = 0; j < DE[i].length; j++) {
                if (DE[i][j].contains("$")){
                   // DE[i][j].replaceAll("$","");
                    ///money[i][j]
                     sum +=Double.parseDouble(DE[i][j].replace("$", ""))*3.2;

                    //double Dollar =  money[i][j] * 3.2;
                  //  System.out.println(Dollar);

            } if(DE[i][j].contains("€")){
                    //DE[i][j].replaceAll("€","");
                   // money[i][j]
                    sum +=Double.parseDouble(DE[i][j].replace("€", ""))*4.2;
                    //double Euro =  money[i][j] * 4.2;
                    //System.out.println(Euro);
                }

        }
        }
        System.out.println(sum);
    }
}



