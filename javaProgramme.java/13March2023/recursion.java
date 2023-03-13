class rec{
	void Adoll(int doll){
		if(doll==1){
			System.out.println("All doll are open");
			}
			else{
				Adoll(doll-1);
				}
		}
	}
	class recursion{
		public static void main(String[]args){
			rec a=new rec();
			a.Adoll(5);
			}
		}