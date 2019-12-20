layui.use('form', function () {
	var form = layui.form;
	form.on('submit(formDemo)', function (data) {
		ajax_post(data);
		return false;
        });
});


function ajax_post(data){
	$ajax({
		type:'post',
		data:data.field,
		url:'storefinfo/addStore.do',
		success:function(res){
			console.log(res);
		}
		
		
	})
}