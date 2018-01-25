package arrays;

public class CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        for(int i = 0; i < flowerbed.length; i++){
            if(flowerbed[i] == 0){
                int start = i;
                while(i < flowerbed.length && flowerbed[i] == 0){i++;}
                if(start == 0 && i == flowerbed.length){
                    return (i + 1) / 2 >= n;
                }
                i--;
                if(start == 0 || i == flowerbed.length - 1){
                    count += (i + 1 - start) / 2;
                }else{
                    count += (i - start) / 2;
                }
                
            }
        }
        return count >= n;
    }

}
