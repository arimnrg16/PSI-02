function validform() {

    var a = document.forms["my-form"]["uang_pembangunan"].value;
    var b = document.forms["my-form"]["uang_pendaftaran"].value;
    var c = document.forms["my-form"]["uang_spp"].value;
    var d = document.forms["my-form"]["total"].value;
    var e = document.forms["my-form"]["file"].value;
   

    if (a==null || a=="")
    {
        alert("Silahkan masukkan Uang Pembangunan");
        return false;
    }else if (b==null || b=="")
    {
        alert("Silahkan masukkan Uang Pendaftaran");
        return false;
    }else if (c==null || c=="")
    {
        alert("Silahkan masukkan Uang SPP");
        return false;
    }else if (d==null || d=="")
    {
        alert("Silahkan masukkan Total");
        return false;
    }else if (d==null || e=="")
    {
        alert("Silahkan pilih bukti Pembayaran");
        return false;
    }
    }