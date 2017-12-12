public class Solutions{

	//submited by David Brackin
	public static int wave(int n, int k, int t){
	    
	    if(t < k){
	        return t;
	    }else if(t < n){
	        return k;
	    }else {
	        return (k + n) - t;
	    }
	    
	}


	public static String div(String n){
	    int zeros = 0;
	    for(int i = n.length()-1; i >= 0; i--){
	        if(n.charAt(i) == '0'){
	            zeros++;
	        }
	        if(zeros >= 6 && n.charAt(i) == '1'){
	            return "yes";
	        }
	    }
	    return "no";
	}

	public static String broken(String n){
	    String[] friends = {"Danil", "Olya", "Slava", "Ann","Nikita"};
	    int count = 0;
	    int last;
	    for(int i = 0; i < friends.length; i++){
	        last = 0;
	        while( last != -1 ){
	            last = n.indexOf(friends[i],last);
	            
	            if(last != -1){
	                count++;
	                last += friends[i].length();
	            }
	        }
	    }
	    return count == 1? "YES":"NO";
	}
	
	//submitted by Joshua Bantayan
	public static void offices(){
	    String city = kbd.next();
            int count = 0;
	    for (int i = 1; i < city.length(); i++)
                if (city.charAt(i) == 'F' && city.charAt(i-1) == 'S') {
		    count++;
	        } else if (city.charAt(i) == 'S' && city.charAt(i-1) == 'F') {
	            count--;
			}
	    System.out.println(count > 0 ? "YES" : "NO");
	}
	
	public static void diary(){
	    int n = Integer.parseInt(scan.nextLine());
	    HashSet<String> setHash = new HashSet<String>();
		for(int i = 0; i < n ; i++){
	            String str = scan.nextLine();
			
		    if(setHash.contains(str)){
		        System.out.println("YES");
			} else {
			    System.out.Println("NO");
		            tHash.add(str);
			}
			
		}
	}
	
	public static void acm(){
	    int n = 0;
            int[] values = new int[6];
	        for(int x = 0; x < 6; x++) {
	            values[x] = scan.nextInt();
		    n += values[x];
		}
		boolean flag = false;
		l: for(int i = 1; i < 5; i++) {
			for(int j = i + 1; j < 6; j++) {
			    if(2*(values[0]+values[i]+values[j])==n) {
			        System.out.println("YES");
				flag = true;
				break l;
				}
			}
		}
		if(!flag) {
		    System.out.println("NO");
		}
	}
}
