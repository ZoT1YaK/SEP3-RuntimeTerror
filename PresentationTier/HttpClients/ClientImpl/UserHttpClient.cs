using System.Net.Http.Json;
using System.Security.Claims;
using System.Text.Json;
using HttpClients.ClientInterfaces;
using Shared.DTOs;
using Shared.Models;


namespace HttpClients.ClientImpl;

public class UserHttpClient : IUserService
{
    private readonly HttpClient Client;
    public static string? Jwt { get; private set; } = "";
    
    public UserHttpClient(HttpClient client)
    {
        Client = client;
    }
    
    public async Task<User> CreateAsync(UserCreationDTO dto)
    {
        HttpResponseMessage response = await Client.PostAsJsonAsync("/users", dto);
        string result = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(result);
        }

        User user = JsonSerializer.Deserialize<User>(result, new JsonSerializerOptions
        {
            PropertyNameCaseInsensitive = true
        })!;
        return user;
    }

    public Task LoginAsync(string username, string password)
    {
        throw new NotImplementedException();
    }

    public Task LogoutAsync()
    {
        throw new NotImplementedException();
    }

    public Task<ClaimsPrincipal> GetAuthAsync()
    {
        throw new NotImplementedException();
    }

    public Action<ClaimsPrincipal> OnAuthStateChanged { get; set; }
}