class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
            int i = 0;

            while( flowerbed.length > i){
               System.out.println(n);
                if((i - 1) < 0) {

                    if(flowerbed[i] != 1 && (flowerbed.length == i+1 || flowerbed[i+1] != 1)) {
                        flowerbed[i] = 1;
                        n--;
                    }
                    
                }
                else if ( (i + 1) >= flowerbed.length) {
                     if(flowerbed[i] != 1 && flowerbed[i-1] != 1) {
                        flowerbed[i] = 1;
                        n--;
                    }
                }
                else if ((flowerbed[i] != 1) && (flowerbed[i+1] != 1) && (flowerbed[i-1] != 1)) {
                            flowerbed[i] = 1;
                            n--;
                }
                i++;
            }

        return n <= 0;
    }
}