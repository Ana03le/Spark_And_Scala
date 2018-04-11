
var tempLine

var inc = 0

var value = 0

for(line) {

tempLine = s"${line},${inc}"
inc = inc + 1
temp = line.split(,)(2)
if(temp != null) {
	value = $temp
}
tempLine = s"${tempLine},${value}"
} 


object CSVRead3{
   def main(args: Array[String]) {
      
      val bufferedSource = io.Source.fromFile("/src/main/scala/test1.csv")
   
      var inc = 1
	  var value=""
	
      
      for (line <- bufferedSource.getLines)
      {
	    var temp = line.split(,)(2)
        if(temp != null) 
		{
	     value = $temp
       }
	    inc=inc+1
      	println(s"${inc},${temp},${line}")

	}
    
  bufferedSource.close
   }
}
