// Calculate tip amount
function calculate(){
    var billAmount = document.getElementById("bill-total").value;
    var shareBill = document.getElementById("party").value;
    var serviceQuality = document.getElementById("service-quality").value;
    var result =((billAmount * serviceQuality) / (shareBill));
    result = Math.round(result * 100) / 100;
    result = result.toFixed(2);
    document.getElementById("total").innerHTML = "$" + result;
}