class Main {
    public static void main(String[] args) {
	SumaDosNumeros Suma = new SumaDosNumeros();
	int n1,n2;
	n1 = Integer.parseInt(args[0]);
	n2 = Integer.parseInt(args[1]);
	System.out.println(Suma.suma(n1,n2));
    }
}
