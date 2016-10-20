<%@ page session="false" contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:h="http://java.sun.com/jsf/html"
    xmlns:f="http://java.sun.com/jsf/core" xmlns:ui="http://java.sun.com/jsf/facelets">


<html>

<head>
    <title>My JSF Page</title>
</head>

<body>

<f:view>
    <h:form>

        <f:loadBundle basename="org.myorganization.component.example.build" var="buildInfo"/>

        <h:panelGrid columns="2">
            <h:outputText style="font-weight: bold" value="My JSF Components Library"/>
            <h:outputText value=" (Version #{buildInfo['mycomponents_version']}, using #{buildInfo ['jsf_implementation']})"/>
        </h:panelGrid>

        <h:panelGrid>

            <h:outputText value="My component examples" />
            <h:panelGrid style="padding-left:25px">
                <h:outputLink value="sayhello.jsf">
                    <f:verbatim>sayHello - demo component</f:verbatim>
                </h:outputLink>
            </h:panelGrid>

        </h:panelGrid>

    </h:form>
</f:view>
</body>
</html>
