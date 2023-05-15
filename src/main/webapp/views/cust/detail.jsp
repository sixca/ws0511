<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<script>
    let member_detail={
        init: function(){
            $('#update_btn').click(function(){
                member_detail.send();
            });
            $('#delete_btn').click(function(){
                var c = confirm("삭제 하시겠습니까?");   //confirm창 호출
                if(c == true){
                    location.href="/member/deleteimpl?id=${memberinfo.member_id}";
                }
            });
        },
        send: function(){
            $('#detail_form').attr({
                method:'post',
                action:'/member/updateimpl'
            });
            $('#detail_form').submit();
        }
    };
    $(function (){
        member_detail.init();
    });
</script>

    <div class="container-fluid">

        <!-- Page Heading -->
        <h1 class="h3 mb-2 text-gray-800">Member Detail  : ${memberinfo.member_id}</h1>

        <!-- DataTales Example -->
        <div class="card shadow mb-4">
            <div class="card-header py-3">
                <h6 class="m-0 font-weight-bold text-primary">상세정보</h6>
            </div>
            <div class="card-body">
                    <form id="detail_form" class="form-horizontal well">
                        <div class="form-group">
                            <label class="control-label col-sm-2" for="id">ID:</label>
                            <div class="col-sm-10">
                                <input type="text" name="id" class="form-control" id="id" value="${memberinfo.id}" readonly>
                            </div>
                            <div class="col-sm-10">
                                <span class="bg-danger"></span>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-2" for="member_id">ID:</label>
                            <div class="col-sm-10">
                                <input type="text" name="member_id" class="form-control" id="member_id" value="${memberinfo.member_id}">
                            </div>
                            <div class="col-sm-10">
                                <span class="bg-danger"></span>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-2" for="password">Password:</label>
                            <div class="col-sm-10">
                                <input type="password" name="password" class="form-control" id="password">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-2" for="name">Name:</label>
                            <div class="col-sm-10">
                                <input type="text" name="name" class="form-control" id="name" value="${memberinfo.name}">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-2" for="valid">Valid (Input 1 or 0) :</label>
                            <div class="col-sm-10">
                                <input type="text" name="valid" class="form-control" id="valid" value="${memberinfo.valid}">
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-sm-offset-2 col-sm-10">
                                <button id="update_btn" type="button" class="btn btn-default">Update</button>
                                <button id="delete_btn" type="button" class="btn btn-default">Delete</button>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>

    </div>
    <!-- /.container-fluid -->
</div>