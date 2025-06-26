x<-4
  result<-switch(x,"hello","how","are","you","Select range B/w 1-4")
  
print(result)

#user- define:
a<-as.numeric(readline("Enter num b/w 1 to 10:"))
 code<-switch(a,"the","code","is","very","easy","to","deploy","in","the","screen","invalid")

print(code)

# Fun with switch:
custom<-as.numeric(readline("Enter choice b/w 1-5:"))
cat("you chose",custom,"\n")
  fun<-switch(custom, 
              "Your Tea",
              "Your Coffee",
              "Your Juice",
              "your water",
              "you choose me",
              "invalid syntex")
print(fun)