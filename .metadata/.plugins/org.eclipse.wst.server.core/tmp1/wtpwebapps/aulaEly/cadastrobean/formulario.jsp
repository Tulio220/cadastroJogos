<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="p" class="org.libertas.Pessoa" scope="page"/>
<jsp:useBean id="pdao" class="org.libertas.PessoaDao" scope="page"/>
<jsp:setProperty property="*" name="p"/>
${p = pdao.consultar(p.idpessoa)}
<form action="gravar,jsp" method="post">
	Nome:
	<input type="text" name="nome" />
	</br> 
	Telefone:
	<input type="text" name="telefone" />
	</br> 
	E-mail:
	<input type="text" name="email" />
	</br> 
	Cidade:
	<input type="text" name="cidade" />
	</br> 
	<input type="submit" name="salvar" />
</form>

</body>
</html>