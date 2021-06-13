$(document).ready(function (){
    let id = 0;
    $("#save-button").click(function () {
        const fullName = $("#fullName").value();
        const birthday = $("#birthday").value();
        const hometown = $("#hometown").value();
        const className = $("#className").value();
        const gender = $("#gender").value();

        if(fullName === ""||birthday === ""||hometown===""||className===""||gender===""){
            alert("Nhập thiếu thông tin! Vui lòng nhập lại");
            return 0;
        }

        $("#table-data").append("<tr>" +
            "<td class='name'>" + fullName + "</td>" +
            "<td class='birthday'>"+ birthday +"</td>" +
            "<td class='hometown'>"+ hometown +"</td>" +
            "<td class='className'>"+ className +"</td>" +
            "<td class='gender'>"+ gender +"</td>" +
            "</tr>");
    })
})