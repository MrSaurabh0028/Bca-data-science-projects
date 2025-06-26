# vactor
a<-c("apple","mango","grapes","banana","dragenfruit")
if("app"%in% a)
{
  print("found")
}else
  {
  print("not found")
  }

# Double arruments in vactor(paste)
a<-c("apple","mango","grapes","banana","lichhi")
if("apple"%in% a)
{
  print(paste(a,"found"))
}else
{
  print(paste(a,"not found"))
}
marks<-100
if(marks>85){
  print("first")
}
else if(marks>75)
  {
  print("Second")
}
else if(marks>65){
  print("Third")
}else{
  print("fail")
}