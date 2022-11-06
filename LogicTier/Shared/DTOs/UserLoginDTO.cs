namespace Shared.DTOs;

public class UserLoginDTO
{
    public string Username { get; set; }
    public string Password { get; set; }

    public UserLoginDTO(string username, string password)
    {
        Username = username;
        Password = password;
    }
}