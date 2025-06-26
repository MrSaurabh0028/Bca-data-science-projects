#) student and their marks with percentage
name<-readline("Enter your name:")
cat("login mr",name,"\n")
cat("Read carefully and fill the marks:",)
sub<-as.numeric(readline("Enter maths score:"))
sub1<-as.numeric(readline("Enter science score:"))
sub2<-as.numeric(readline("Enter english score:"))
total<-(sub+sub1+sub2)
cat("total marks:",total,"\n")
per<-(total/300)*100
cat("total percentage:",per,"%","\n")
if(per>=85)
{
  cat("grade A")
}else if(per>=75)
{
 cat("grade B") 
}else if(per>=65)
{
  cat("grade c")
}else
{
  cat("fail")
}