<%@ tag dynamic-attributes="attrs" %><%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %><%@ taglib tagdir="/WEB-INF/tags" prefix="w" %><%@ attribute name="alt" required="true" %><%@ attribute name="src" required="true" %><img alt="${alt}" src="<w:asset src="${src}" folder="img"/>" <c:forEach var="attr" begin="0" items="${attrs}">${attr.key}="${attr.value}" </c:forEach>/>