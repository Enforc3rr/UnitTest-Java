# Unit-Test Java [Junit]

Add this dependency
```
<dependencies>
        <dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter-api</artifactId>
            <version>5.9.2</version>
            <scope>test</scope>
        </dependency>
</dependencies>
```
### Key Points :
- Test methods don't need to be public.
- They don't need to return anything.
- Unit test as their name suggests only test one thing , one single scenario.
- Name should be very descriptive.
- To verify if our method is working as expected we use Assert Statement.
- Running test with coverage means that we will be able to see which lines of code were executed . 
- We should try to hit all the scenarios when we write our test cases.
     