class Solution {
    public int maxDifference(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);

        int oddMax = 1;
        int evenMin = 99;

        int counter = 1;
        for (int i = 1; i < s.length(); i++) {

            if (arr[i - 1] != arr[i]) {

                if (counter % 2 == 0) {
                    evenMin = evenMin > counter ? counter : evenMin;
                    

                } else {
                    oddMax = oddMax > counter ? oddMax : counter;
                }

                counter = 1;
            } else counter++;

            
        }

         if (counter % 2 == 0) {
                    evenMin = evenMin > counter ? counter : evenMin;
                    

                } else {
                    oddMax = oddMax > counter ? oddMax : counter;
                }


        System.out.println(counter);

        System.out.println(oddMax);      
        System.out.println(evenMin);
            return oddMax - evenMin;
        }
    }
    