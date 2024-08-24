<!DOCTYPE html>
<html lang="pt">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/reset.css">
    <link rel="stylesheet" href="css/style.css">
    <title>Login Facebook</title>
    <style>

        .center{
            max-width: 100%;
            padding: 0 2%;
            margin: 0 auto;
        }

        .clear{
            clear: both;
        }

        header{
            background: #3665af;
        }
        .logo{
            float: left;
            color: white;
        }
        .logo h2{
            font-size: 29px;
            font-weight: normal;
        }
        form.form-login{
            float: right;
        }

        .form-login .form-input{
            display: inline-block;
            margin-right:15px ;
        }
        .form-input p{
            color: white;
            font-size: 14px;
        }
        .form-input input[type=email],
        .form-input input[type=password]{
            margin-top: 4px;
            border: 0;
            height: 22px;
            padding-left: 3px;
        }
        .form-input input[type=submit]{
            cursor: pointer;
            border:0;
            background:#1969e5;
            border: 2px sold #215ab2;
            color: white;

        }

        main{
            background:linear-gradient(white, #D3D8E8);
            padding: 40px 0;
        }

        .img-pessoas{
            float:left;
            width: 50%;
        }

        .img-people{
            max-width:100%
        }

        .open-account{
            float: left;
            width: 38%;
        }

        .open-account h2{
            color:black;
            font-size: 26px;
        }

        form.open-account{
            margin-top: 10px;
            padding: 0 5px;
        }
        .w50{
            width: 100%;
            float: left;
            padding: 0 5px;
        }
        .w100{
            padding: 0 5px;
            width: 100%;
            float: left;
        }
        form.open-account input{
            width: 100%;
            margin-top: 8px;
        }

        form.open-account input[type=email],
        form.open-account input[type=text],
        form.open-account input[type=password]{
                height: 40px;
                padding-left: 10px;
                border-radius: 9px;
                border:1px solid #a5dcff;
        }

        form.open-account input[type=submit]{
            height: 40px;
            background: linear-gradient(#67ae55, #578843);
            color: white;
            cursor: pointer;
            border: 0;
            max-width: 200px;
        }

        form.w100 h2{
            color: #1d2129;
            margin-top: 10px;
            font-size: 22px;
            font-weight: normal;
        }
        form select.nasc{
            float:left;
            margin-top: 5px;
        }

        .input-radio{
            float: left;
            width: 50%;
            margin: 8px 10px;
        }
        .input-radio h2{
            display: inline-block;

        }
        .input-radio input[type=radio]{
            width: auto !important;
            display: inline-block;
        }
/***********************************************************/        
/***********************************************************/
        @media screen and (max-width:768px){
            .logo{
                width: 100%;
                text-align: center;
            }
            form.form-login{
                width: 100%;
                margin-top:17px ;
                float: none;
                display: inline-block;
                text-align: center;
            }

            .form-login .form-input{
            display: block;
            margin: 10px 0;
        }
        .form-input p{
            color: white;
            font-size: 14px;
        }
        .form-input input[type=email],
        .form-input input[type=password]{
            margin-top: 4px;
            border: 0;
            width: 100%;
            height: 22px;
            max-width: 320px;
            padding-left: 3px;
        }
        .form-input input[type=submit]{
            width: 140px;
        }
        .img-people{
            display: none;
        }
        .open-account{
            width: 100%;
        }
        }

    </style>
</head>
<main>

    <header>
        <div class="center">
            <div class="logo">
                <h2>Facebook</h2>
            </div>
            <form method="post" class="form-login">
                <div class="form-input">
                    <p>E-mail</p>
                    <input type="email">
                </div>

                <div class="form-input">
                    <p>Senha:</p>
                    <input type="password">
                </div>

                <div class="form-input">
                    <input type="submit" name="acao" value="Enviar">
                </div>
                </form>
                <div class="clear"></div>
            </div>
    </header>

    <main> 
        <div class="center">
            <div class="img-people">
                <img src="img/peoples.jpg" alt="img">
            </div>
            <div class="open-account">
                <h2>Abra sua conta.É gratuito e sempre será</h2>
                <form class="create-account">
                    <div class="w50">
                        <input placeholder="Nome" type="text">
                    </div>
                    <div class="w50">
                        <input placeholder="SobreNome" type="text">
                    </div>
                    <div class="w100">
                        <input placeholder="E-mail" type="email">
                    </div>
                    <div class="w100">
                        <input placeholder="Senha" type="password">
                    </div>

                    <div class="w100">
                        <h2>Data de Nascimento:</h2>
                        <select id="dia" name="nascday" class="nasc">
                            <?php for($i=1; $i<=31; $i++){?>
                            <option value="<?php echo $i ?>"><?php echo $i; ?></option>
                            <?php } ?>
                        </select>
                        <select name="nascmon" class="nasc">
                            <option value="1">Junho</option>
                        </select>
                        <select id="anos" name="nascyear" class="nasc">
                            <?php for($i=1960; $i<=2030; $i++){?>
                        <option value="<?php echo $i ?>"><?php echo $i; ?></option>
                        <?php } ?>
                        </select>
                        <div class="clear"></div>
                    </div>

                    <div class="w100">
                        <div class="input-radio">
                            <input name="sexo" value="masculino" type="radio">
                            <h2>Masculino</h2>
                        </div>
                        <div class="input-radio">
                            <input name="sexo" value="feminino" type="radio">
                            <h2>Feminino</h2>
                        </div>
                        <div class="clear"></div>
                    </div>

                    <div class="w100">
                        <input name="acao" value="Cadastrar!" placeholder="Senha" type="submit">
                    </div>
                </form>
            </div>
            <div class="clear"></div>
        </div>

    </main>
    
    <link href="js/script.js">
</body>
</html>