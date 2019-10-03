#fundamentals 2

##coding standards & general stuff learned

###github
- Commit regularly
- Don't push directly to master
- Commit with correct email address
- Gitignore sensitive information
- Check branch is not behind master branch before pushing
- If branch is behind master branch make sure the new master changes do not cause conflict
- Don't commit config files

###java
- Comments should not require scrolling
- Brackets before args preferred
- Consistent indentation
- Useful variable and class names
- Variables should be in camelCase
- Classes should be PascalCase
- Initialise the variables on a new line
- Underscores in numbers to improve readability
- String.format is better than concatination of strings but StringBuilder is best
- Java doc style comments go above 
- Helpful documentation pls
- Use "is" in if loops
- Start with everything as private, change it later
- Constants go at the top
- Reuse variables where appropriate
- Left side should be true, right side should be false when using ternaries
- Use a default in switch statements
- Stop code being immutable
- Can't start a method name with a number
- SRP, methods should only do one thing
- Don't just do throws - Exception
- Documetn exceptions in order WHAT METHOD DOES, INPUT, RETURN and WHY IT COULD GO WRONG
- Do not use throwable, just hides the errors kinda