<%@page import="org.libertas.Jogo"%>
<%@page import="org.libertas.JogoDao"%>
<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <title>Jogo Salvo</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <style>
        body {
            background-color: #f0f8ff; /* Fundo suave */
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            flex-direction: column;
            animation: fadeIn 1s; /* Animação de entrada */
        }
        h1 {
            color: #4CAF50; /* Verde suave */
            margin-bottom: 20px;
            text-align: center;
        }
        .btn {
            background-color: #6c757d; /* Cor suave para o botão */
            color: white;
            border-radius: 5px;
            transition: background-color 0.3s; /* Transição suave */
        }
        .btn:hover {
            background-color: #5a6268; /* Cor de hover mais escura */
        }
        @keyframes fadeIn {
            from {
                opacity: 0;
            }
            to {
                opacity: 1;
            }
        }
        .message {
            background-color: white; /* Fundo branco para a mensagem */
            padding: 20px;
            border-radius: 10px; /* Bordas arredondadas */
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2); /* Sombra sutil */
            animation: slideIn 0.5s ease-in-out; /* Animação de entrada */
        }
        @keyframes slideIn {
            from {
                transform: translateY(-20px);
                opacity: 0;
            }
            to {
                transform: translateY(0);
                opacity: 1;
            }
        }
    </style>
</head>
<body>
    <div class="message">
        <h1>Jogo salvo com sucesso!</h1>
        <p>Seu jogo foi adicionado à nossa biblioteca. Obrigado por contribuir!</p>
        <a href="index.jsp" class="btn">Voltar ao Início</a>
    </div>
</body>
</html>
