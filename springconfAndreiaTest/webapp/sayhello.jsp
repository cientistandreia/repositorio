<%@ page session="false" contentType="text/html;charset=utf-8"%>

<html xmlns="http://www.w3.org/1999/xhtml" xmlns:h="http://java.sun.com/jsf/html"
    xmlns:f="http://java.sun.com/jsf/core" xmlns:ui="http://java.sun.com/jsf/facelets">

<html>
<head>
    <title>My JSF Components</title>
</head>

<body>

<f:view>

    <mycomp:sayHello name="John" lastName="Smith"/>

    <h:outputText value=" (probably not you, I know)"/>

    <f:verbatim><hr></f:verbatim>

    <h:form>
        <h:panelGrid columns="2">
            <h:outputLabel for="inputName" value="name" />
            <h:inputText id="inputName" value="#{sayHelloBean.Name}"/>

            <h:outputLabel for="inputLastName" value="Last name" />
            <h:inputText id="inputLastName" value="#{sayHelloBean.lastName}"/>

             <h:outputLabel for="inputDescription" value="Description" />
            <h:inputText id="inputDescription" value="#{sayHelloBean.Description}"/>


             <h:outputLabel for="inputId" value="Id" />
            <h:inputText id="inputId" value="#{sayHelloBean.Id}"/>

        </h:panelGrid>

        <h:panelGrid columns="1">

            <h:commandButton value=OK!" actionListener="#{sayHelloBean.sayIt}"/>

            <mycomp:sayHello firstName="#{sayHelloBean.name}"
                             lastName="#{sayHelloBean.lastName}"
                              description="#{sayHelloBean.description}"
                             id="#{sayHelloBean.id}"
                             rendered="#{sayHelloBean.renderGreeting}"/>

            <h:commandLink value="[HOME]" action="go_home"/>

        </h:panelGrid>

    </h:form>

</f:view>


</body>

</html>
