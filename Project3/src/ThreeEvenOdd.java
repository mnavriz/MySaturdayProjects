public class ThreeEvenOdd {

    /*

    Given an int array as a parameter
    return true if the array contains either 3 even or 3 odd values .

    for Example:

    intArray([2, 1, 3, 5]) result should be true
    intArray([2, 1, 2, 5]) result should be  false
    intArray([2, 4, 2, 5]) result should be  true

     */

    public boolean threeEvenOrOdd(int[] intArr) {
        int EvenCounter = 0;
        int OddCounter = 0;

        for (int j : intArr) {

            if (j % 2 == 0) {
                EvenCounter++;
            }
                else {
                    OddCounter++;

                }

        }
        if (OddCounter ==3 || EvenCounter==3){
            return true;
        }




return false;

}
}