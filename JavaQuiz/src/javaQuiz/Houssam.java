package javaQuiz;

public class Houssam {
	
	public static boolean comparer(char[] tab){
		
		int size = tab.length;
		for(int i=0;i<tab.length-1/2;i++){
			if(tab[i] != tab[tab.length-1-i]){
				return false;
			}
		}
		return true;
		
	}
	

	public static void main(String[] args) {
		
		char[] tab = {'a','o','r','o','a'};
		boolean res = comparer(tab);
		System.out.println(res);
		
	}

}
