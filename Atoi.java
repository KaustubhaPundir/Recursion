public class Atoi{
    public static void main(String[] args) {
        int sol=getAtoi("321",0,0);
        System.out.println(sol);
    }

    public static int getAtoi(String s,int index,int solution){
        if(index>=s.length()){
            return solution;
        }
        if((int)s.charAt(index)-(int)'0'>9 || (int)s.charAt(index)-(int)'0'<0){
            return -1;
        }
        solution=solution*(10)+(int)s.charAt(index)-(int)'0';

        return getAtoi(s, index+1, solution);
    }
}
