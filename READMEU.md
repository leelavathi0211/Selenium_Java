Playwright JAVA-----UDEMY(E0)

Day-1
1.Playwright intro and advantages
2.Download and setup of libraries
3.GITHUB Setup
4.Launch browser

->By default playwright launches the browser in headless mode to launch the browser normally set the properties ad false for headlessmode
->page.close()- closes only the browser but not the entire session
->Playwright.close()-closes and terminates the entire session
->To maximize the browser we have to set the screensize properly by providing ht and width. Instead of hardcoding use toolkit to print the ht and width and pass the same for correct output

Day-2
1.Launch url in different browsers
2.Navigation techniques
3.Handling various locators and basic actions
4.Record and play and insallation of maven

->.fill() -to add additional wait time or .type()-without wait time
->Command to run and auto generate the code with xpaths
-open the cmd from pom path and run this command
mvn exec:java -e -D exec.mainClass=com.microsoft.playwright.CLI -D exec.args="codegen demo.playwright.dev/todomvc"

Day-3
1.Handling dropdown
2.Checkbox

->innertext()==gettext() and getAttribute()-to get value
->findelements()==queryselectAll-return list of web elements
