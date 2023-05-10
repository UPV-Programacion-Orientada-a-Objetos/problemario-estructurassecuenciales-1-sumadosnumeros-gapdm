class Main {
    public static void main(String[] args) {
	//Creamos objeto asdaf
	SumaDosNumeros Suma = new SumaDosNumeros();
	int n1,n2;
	n1 = Integer.parseInt(args[0]);
	n2 = Integer.parseInt(args[1]);
	System.out.println(Suma.suma(n1,n2));
    }
}
