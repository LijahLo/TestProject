public class myCalculator {
    public double doAddition(double x, double y){
        return (x + y);
    }
    public double doSubtraction(double x, double y){
        return (x + y);
    }
    public double doMultiplication(double x, double y){
        return (x * y);
    }
    public double doDivision(double x, double y){
        if( y == 0.0){
            throw new ArithmeticException();
        }
        return ( x/y);
    }
}

