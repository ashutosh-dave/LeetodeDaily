class Solution {
    public boolean halvesAreAlike(String s) {
     Set<Character> set = new HashSet<>();
	set.add('a');set.add('e');set.add('i');set.add('o');set.add('u');
	int i = 0, count = 0;
	for(;i<s.length();i++)
		if(set.contains(s.charAt(i)) || set.contains(Character.toLowerCase(s.charAt(i)))) 
			count = (i<s.length()/2) ? count + 1 : count - 1;
	return count == 0;
    }
}