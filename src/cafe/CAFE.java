package cafe;

import java.util.Arrays;

public class CAFE {

	public static void main(String[] args) {
		TeaType tea = TeaType.보성녹차;
		System.out.println("Cafe에 어서오세요");
		TeaType teaTypes[] = TeaType.values();
		String menu = String.join("/",
				TeaType.감잎차.toString(),
				TeaType.보성녹차.toString(),
				TeaType.율무차.toString());
		System.out.println(menu);

	}

}
