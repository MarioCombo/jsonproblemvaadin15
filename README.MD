This project illustrates a problem in Vaadin 15 on JSON based REST apis

When you launch this project and go to http://localhost:8080/api/get the result shows

{codeNumber: "007", name: "Bond", firstName: "James"}

But since name is the only property in the Entity class with a public getter, the response should be
{name: "Bond"}

When removing the Vaadin depencies form the project, this expected response is rendered.