class Solution {
    public int finalPositionOfSnake(int n, List<String> lt) {
		int x =0;
		for(int i=0;i<lt.size();i++) {
			if(lt.get(i).equals("RIGHT")) {
				x++;
			}
			if(lt.get(i).equals("LEFT")) {
				x--;
			}
			if(lt.get(i).equals("DOWN")) {
				x+=n;
			}
			if(lt.get(i).equals("UP")) {
				x-=n;
			}
		}
		return x;
	}
}
