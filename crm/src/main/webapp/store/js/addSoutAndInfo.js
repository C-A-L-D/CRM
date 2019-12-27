layui.use(['form','laydate'], function () {
	var form = layui.form;
	var laydate = layui.laydate;
	
	  laydate.render({ 
		  elem: '#maketime'
		  ,type: 'datetime'
		});
	
	form.on('submit(addsout)', function (data) {
		postSout(data.field);
		return false;
        });
	
	form.on('submit(addsellinfo)', function (data) {
		postSellinfo(data.field);
		return false;
        });
});

function postSout(data){
	console.log(data);
	$.ajax({
		type:'post',
		url:'storeSout/addSout.do',
		data:data,
		success:function(res){
			if (res.status == 200) {
				layer.msg('添加成功！', {icon: 1,time:1000});
				layui.use('layer',function(){
					  layer.confirm(
							  '您已成功添加了一张空白的销售单，需要向其中添加商品吗？',
							  { icon: 6, title: '提示' },
							  function (index) {
								//页面跳转向控制器传递参数
								  setTimeout(function(){window.location.href="storeSout/listpageSout.do";},1000);
								  layer.load(1);
							  },
							  function(){
								  layer.load(1);
								setTimeout(function(){window.location.href="storeSout/listpageSout.do";},1000);
							  }
					  );
				});
		      //  parent.location.reload();
			} else {
				layer.msg('添加失败！', {icon: 2,time:1000});
				setTimeout(function(){window.location.href="storeSout/listpageSout.do";},1500);
			}
		},
		error:function(res){
			console.log(res);
		}
	})
}



function postSellinfo(data){
	console.log(data);
//	$.ajax({
//		type:'post',
//		url:'',
//		data:data,
//		success:function(res){
//			
//		}
//	})
}