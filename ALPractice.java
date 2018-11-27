import java.util.ArrayList;
public class ALPractice{
	public static ArrayList<Integer> combine(ArrayList<Integer> x, ArrayList<Integer> y){
		ArrayList<Integer> a = new ArrayList<>();
		for(int i = 0; i< x.size(); i ++){
			int b = x.get(i);
			a.add(b);
		}
		for(int i = 0; i< y.size(); i ++){
			int c = y.get(i);
			a.add(c);
		}
		return a;
	}

	public static void printList(ArrayList<Integer> x){
		for(int i = 0; i < x.size(); i++){
			int j = i+1;
			int a = x.get(i);
			if(j!=x.size()){
				System.out.print( a + ", ");
			}
			else{
				System.out.print(a);
			}
		}
	}

	public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> x){
		for(int i = 0; i < x.size(); i ++){
			int a = x.get(i);
			for(int j = i+1;j<x.size(); j++){
				if(x.get(j)==a){
					x.remove(j);
				}


			}
		}

		return x;




	}

	public static void main(String [] args){
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();

		for(int i = 0; i<10; i++){
			list1.add(i);
		}
		for(int i = 0; i< 18; i ++){
			list2.add(i);

		}
		System.out.println(combine(list1,list2));
		printList(list2);
		list2.add(5);
		list2.add(9);
		list2.add(12);
		System.out.println();
		System.out.println(list2);
		System.out.println(removeDuplicates(list2));

	}




}