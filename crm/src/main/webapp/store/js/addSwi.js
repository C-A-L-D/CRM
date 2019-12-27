layui.use(['form','layer'], function(){
//	$ = layui.jquery;
	var form = layui.form
	,layer = layui.layer;

	//监听提交
	form.on('submit(add)', function(data){
	console.log(data);
	$.ajax({
		type: 'post',
		url: "storeWhinfo/addSwi.do",
		data: data.field,
		success: function (res) {
			if (res.status == 200) {
				layer.msg('添加成功！', {icon: 1,time:1000});
				setTimeout(function(){layer.load(1);},1000);
				setTimeout(function(){window.location.href="storeWhinfo/listpageSwi.do";},1500);
		      //  parent.location.reload();
			} else {
				layer.msg('添加失败！', {icon: 2,time:1000});
		        window.location.reload();
			}
		}
	});
	return false;
    });
});
