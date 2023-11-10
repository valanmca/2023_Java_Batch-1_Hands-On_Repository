package Java17;

sealed class superClass permits subClassTwo
{
    
}
final class subClassOne extends subClassTwo 
{
    
}

sealed class subClassTwo extends superClass  permits subClassOne
{
    
}

public class SealedClass {

    public static void main(String[] args) {
        
    }

}