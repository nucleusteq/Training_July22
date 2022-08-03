package LambdaFunctions;
import java.util.HashMap;
public class LambdaClass {
	HashMap<String,Shapes> map=new HashMap<String,Shapes>();
	LambdaClass() {
		//Area of Triangle
		map.put("triangle", ()->{
			return 0.5*Shapes.base*Shapes.height;
		});
		
		//Area of Cube
		map.put("cube", ()->{
			return 6*Shapes.side*Shapes.side;
		});
		
		//Area of Circle
		map.put("circle", ()->{
			return Shapes.PI*Shapes.radius*Shapes.radius;
		});
		
		//Area of Rectangle
		map.put("rectangle", ()->{
			return Shapes.length*Shapes.width;
		});
		
		//Area of Cylinder
		map.put("cylinder", ()->{
			return (2*Shapes.PI*Shapes.radius*Shapes.height)+2*Shapes.PI*Shapes.radius*Shapes.radius;
		});
		
		//Area of Pentagon
		map.put("pentagon",()->{
			double num=Math.sqrt(5*(5+2*Math.sqrt(5)));
			return (num*Shapes.side*Shapes.side)/4 ;
		} );
		
		//Area of Cone
		map.put("cone",()->{
			return Shapes.PI*Shapes.radius*(Shapes.radius+Math.sqrt((Shapes.height*Shapes.height)+(Shapes.radius*Shapes.radius)));
		});
		
		//Area of sphere
		map.put("sphere",()->{
			return 4*Shapes.PI*Shapes.radius*Shapes.radius;
		});
	}
}
