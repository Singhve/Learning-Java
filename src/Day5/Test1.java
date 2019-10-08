package Day5;

import java.util.StringTokenizer;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringTokenizer st = new StringTokenizer("my name is khan");  
        
	      // printing next token  
	      System.out.println("Next token is : " + st.nextToken("1")); 
	}

}
/*class RandomShapeGenerator {
061
	 
062
	    private Random rand = new Random();
063
	      
064
	    //Choose randomly a circle, a squere or a triangle
065
	    public Shape next() {
066
	 
067
	  switch (rand.nextInt(3)) {
068
	 
069
	 
070
	default:
071
	 
072
	 
073
	case 0:
074
	 
075
	 
076
	    return new Circle();
077
	 
078
	 
079
	case 1:
080
	 
081
	 
082
	    return new Square();
083
	 
084
	 
085
	case 2:
086
	 
087
	 
088
	    return new Triangle();
089
	 
090
	  }
091
	    }
092
	}
093
	 
094
	public class Polymorphism {
095
	    
096
	    private static RandomShapeGenerator gen = new RandomShapeGenerator();
097
	 
098
	    public static void main(String[] args) {
099
	 
100
	   
101
	 
102
	  //This is an array of references of the superclass Shape
103
	 
104
	  Shape[] s = new Shape[9];
105
	 
106
	   
107
	 
108
	  // Fill up the array with random shapes shapes:
109
	 
110
	  for (int i = 0; i < s.length; i++) {
111
	 
112
	 
113
	s[i] = gen.next();
114
	 
115
	  }
116
	 
117
	   
118
	 
119
	  //s[x].drawShape will call the specific drawShape function of whichever
120
	 
121
	  //shape is s[x] and not the drawShape function of class Shape
122
	 
123
	  //That's polymorphism.
124
	 
125
	  for (int i = 0; i < s.length; i++) {
126
	 
127
	 
128
	s[i].drawShape();
129
	 
130
	  }
131
	 
132
	    }
133
	}*/