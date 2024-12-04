```groovy
def myMethod(String param) {
  if (param == null) {
    println "Parameter is null"
    return
  }
  // ... rest of the method
}

myMethod(null)
myMethod("")
```