public class Grade {

    public char getGrade(int number) throws Exception{
        if(number < 0)
            throw new Exception("Can't be less than 0");
        else if(number < 40){
            return 'C';
        }else if(number < 80)
            return 'B';
        else
            return 'A';
    }
}
