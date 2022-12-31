public class OperatorAssignment {
    public static void main(String[] args) {
        //operator compuesto
        int i =5, j = i + 4;
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        i += 2;
        System.out.println("i = " + i);
        
        i+= 5;
        System.out.println("i = " + i);

        j -=4;
        System.out.println("j = " + j);

        String sqlString = " select * from clientes as c ";
        sqlString += " where c.nombre = 'Andres' ";
        sqlString += "snd c.sctivo =1 ";
        System.out.println("sqlString = " + sqlString);
    }
}
