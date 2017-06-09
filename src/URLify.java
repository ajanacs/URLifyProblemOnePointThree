/**
 * Created by ajana on 6/9/2017.
 */
public class URLify {
    public static int spaceCount(String input){
        int count=0;
        char tempARR[]=input.toCharArray();
        for(char c:tempARR){
            if (c==' ') count++;
        }
        return count;
    }
    public static char[] replaceSpaces(String input){
        char inputArr[]=input.toCharArray();
        int origingalLeng=input.length();
        int spaceCo=spaceCount(input);
        if(spaceCo==0){
            System.out.println("NO spaces in the array");
            return inputArr;}
        int newArrLength=origingalLeng+spaceCo*2;
        char newCharArr[]=new char[newArrLength];
        int i=0;// original Sring index
        for (int j = 0; j < newArrLength ; j++) {
            if(inputArr[i]==' ')
            {
                newCharArr[j++]='%';
                newCharArr[j++]='2';
                newCharArr[j]='0';
            }
            else {
                newCharArr[j]=inputArr[i];
            }
            i+=1;
        }
        for (char c:newCharArr) {
            System.out.print(c);

        }
        return newCharArr;
    }
    public static void printResult(char input[]){
        System.out.println();
        for(char c:input)
            System.out.print(c);
    }


    public static void main(String[] args) {
        String s="to py";
        char output[]=replaceSpaces(s);

    }
}
