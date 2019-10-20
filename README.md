# Spring Boot Validation With Internationalization
Project demonstrates how to use internationalization support for 
Spring Boot Validation (Default messages).

Take a look at `InternationalizationConfig.java` class where I put
the configuration for message source. Validation relies on files that are stored
in `/src/main/resources/i18n` folder. Every `messages_(locale)` file is created for 
specific language.

Default language is set in `localResolver` method by calling **setDefaultLocale** and 
provide the wanted language. Also, there is example of using languages
that are not well-known, for example serbian.

Validation properties are defined in entity class, for example, `User.java`.

## Running the project
1. Create database `int_test`
2. Open project and run command: `mvn clean install -DskipTests`
3. Run app

## Contribution
If someone is interesting in contribution please contact me on e-mail ```hedzaprog@gmail.com```. 
There will be more interesting things to come for Spring Boot especially.

## Author
Heril Muratović  
Software Engineer  
<br>
**Mobile**: +38269657962  
**E-mail**: hedzaprog@gmail.com  
**Skype**: hedza06  
**Twitter**: hedzakirk  
**LinkedIn**: https://www.linkedin.com/in/heril-muratovi%C4%87-021097132/  
**StackOverflow**: https://stackoverflow.com/users/4078505/heril-muratovic