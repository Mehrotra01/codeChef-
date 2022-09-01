package lunchTime_august;
import java.util.*;

public class candyDistributer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		for(int z=0;z<t;z++){
		int a= sc.nextInt();
		int b= sc.nextInt();
		if(a%b==0 && (a/b)%2==0){
		    System.out.println("Yes");
		}else{
		    System.out.println("No");
		}
    }
    sc.close();
    }
}

// inputs
// 4
// 9 3
// 4 1
// 4 2
// 8 3
// outputs
// No
// Yes
// Yes
// No