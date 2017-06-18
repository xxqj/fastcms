function changeImg() {
    var imgSrc = $('#imgObj');
    var timestamp = (new Date()).valueOf();
    var src = locationURL() + '/admin/getVerifyCode.do?timestamp=' + timestamp;
    imgSrc.attr("src", src);
}


var loginFlag = false;

function login() {
    if (loginFlag) {
        return;
    }
    loginFlag = true;
    var username = $('#xmsUsername').val();
    var password = $('#xmsPassword').val();
    var veryCode = $('#veryCode').val();
    if (null == username || '' == username.trim()) {
        $('#xmsUsername').focus();
        loginFlag = false;
        return;
    }
    if (null == password || '' == password.trim()) {
        $('#xmsPassword').focus();
        loginFlag = false;
        return;
    }
    if (null == veryCode || '' == veryCode.trim()) {
        $('#veryCode').focus();
        loginFlag = false;
        return;
    }
    if (veryCode.trim().length != 4) {
        $('#veryCode').focus();
        loginFlag = false;
        return;
    }
    $.ajax({
        url: locationURL() + '/admin/doLogin.do',
        type: "post",
        data: "username=" + username + "&password=" + hex_md5(password) + "&validCode=" + veryCode,
        dataType: 'json',
        success: function(data) {
          // console.log(data);
            if (data.status == 'OK') {
                saveUserInfo();
                window.location.href = locationURL() + "/views/admin/index.jsp";
            } else {
                alert(data.message);
                $('#veryCode').val('');
                changeImg();
            }
            loginFlag = false;
        },
        error: function(XMLHttpRequest, textStatus, errorThrown) {
            alert("调用服务器错误！");
            loginFlag = false;
        }
    });
    
function saveUserInfo() {
    if ($("#rmbUser").prop("checked") == true) {
        var userName = $("#xmsUsername").val();
        var passWord = $("#xmsPassword").val();
        $.cookie("rmbUser", "true", {
            expires: 30
        }); // 存储一个带7天期限的 cookie 
        $.cookie("userName", userName, {
            expires: 30
        }); // 存储一个带7天期限的 cookie 
        $.cookie("passWord", passWord, {
            expires: 30
        }); // 存储一个带7天期限的 cookie 
    } else {
        $.cookie("rmbUser", "false", {
            expires: -1
        });
        $.cookie("userName", '', {
            expires: -1
        });
        $.cookie("passWord", '', {
            expires: -1
        });
    }
}
    
}